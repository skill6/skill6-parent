package cn.skill6.common.utility;

import cn.skill6.common.exception.tools.StackTrace2Str;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 读取服务器的html文件
 *
 * @author 何明胜
 * @version 1.2
 * @since 2018年2月28日 下午12:11:39
 */
@Slf4j
public class ReadHtmlFile {

    /**
     * 读取html文件
     *
     * @param htmlQualifiedName
     */
    public static String readHtmlByName(String htmlQualifiedName) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(htmlQualifiedName)));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                sb.append(temp);
                sb.append("\n");
            }
        } catch (IOException e) {
            log.error(StackTrace2Str.exceptionStackTrace2Str(e));
        }
        return sb.toString();
    }

    /**
     * 根据文件路径读取文件并输出至浏览器
     *
     * @param htmlQualifiedName
     * @param response
     * @throws IOException
     */
    public static void writeHtmlByName(String htmlQualifiedName, HttpServletResponse response)
            throws IOException {
        response.setCharacterEncoding("UTF-8");

        OutputStream outStream = response.getOutputStream();
        try {
            FileInputStream fip = new FileInputStream(htmlQualifiedName);
            // 建立缓冲区
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fip.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            fip.close();
            outStream.close();
            // 关闭输入流,释放系统资源
        } catch (Exception e) {
            log.error(StackTrace2Str.exceptionStackTrace2Str(e));
        }
    }

    /**
     * 修改html的关键字,并返回html内容
     *
     * @param htmlQualifiedName
     * @param keywords
     */
    public static String modifyHtmlKeywords(String htmlQualifiedName, String keywords) {
        // 空格变为英文逗号
        String cmmma = ",";
        if (keywords != null && !keywords.equals("") && !keywords.contains(cmmma)) {
            keywords = keywords.replaceAll("\\s", ",");
        }

        File file = new File(htmlQualifiedName);
        Document doc = null;
        try {
            doc = Jsoup.parse(file, "UTF-8");
        } catch (IOException e) {
            log.error(StackTrace2Str.exceptionStackTrace2Str(e));
        }

        Element keywordsElement = doc.select("meta[name=keywords]").first();

        keywordsElement.attr("content", keywords);

        return doc.html();
    }
}
