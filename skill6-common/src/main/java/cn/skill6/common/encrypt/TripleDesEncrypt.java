package cn.skill6.common.encrypt;

import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

/**
 * 3DES加密
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年3月17日 下午5:45:02
 */
public class TripleDesEncrypt {
    /**
     * 加密算法
     */
    private static final String TRIPLE_DES_ALGORITHM = "DESede";
    /**
     * 算法/模式/补码方式
     */
    private static final String TRIPLE_DES_TRANSFORMATION = "DESede/ECB/PKCS5Padding";

    /**
     * 24位默认密钥
     */
    public static final String DEFAULT_TRIPLE_DES_KEY = "IwL1EObaoKTjhTN8wkuY+tXA";

    /**
     * 3DES加密,使用默认密钥
     *
     * @param dataSource
     * @return 加密后的字符串
     * @throws Exception
     */
    public static String encrypt(final String dataSource) throws Exception {
        return encrypt(dataSource, DEFAULT_TRIPLE_DES_KEY);
    }

    /**
     * 3DESECB加密,key必须是长度大于等于 3*8 = 24 位
     *
     * @param dataSource 数据源
     * @param secretKey  密钥,长度必须是8的倍数
     * @return 返回加密后的数据 Base64编码
     * @throws Exception
     */
    public static String encrypt(final String dataSource, final String secretKey) throws Exception {
        final DESedeKeySpec dks = new DESedeKeySpec(secretKey.getBytes("UTF-8"));
        final SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(TRIPLE_DES_ALGORITHM);
        final SecretKey securekey = keyFactory.generateSecret(dks);

        final Cipher cipher = Cipher.getInstance(TRIPLE_DES_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, securekey);
        final byte[] b = cipher.doFinal(dataSource.getBytes());

        return Base64.getEncoder().encodeToString(b);
    }

    /**
     * 3DES解密,使用默认密钥
     *
     * @param dataSource
     * @return 解密后的字符串
     * @throws Exception
     */
    public static String decrypt(final String dataSource) throws Exception {
        return decrypt(dataSource, DEFAULT_TRIPLE_DES_KEY);
    }

    /**
     * 3DESECB解密,key必须是长度大于等于 3*8 = 24 位
     *
     * @param dataSource 加密之后的数据
     * @param secretKey  密钥,长度必须是8的倍数
     * @return 明码
     */
    public static String decrypt(final String dataSource, final String secretKey) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException {
        // --通过base64,将字符串转成byte数组
        // final byte[] bytesrc = Base64.getDecoder().decode(src);
        final byte[] byteSrc = Base64.getMimeDecoder().decode(dataSource);
        // --解密的key
        final DESedeKeySpec dks = new DESedeKeySpec(secretKey.getBytes(StandardCharsets.UTF_8));
        final SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(TRIPLE_DES_ALGORITHM);
        final SecretKey key = keyFactory.generateSecret(dks);

        // --Chipher对象解密
        final Cipher cipher = Cipher.getInstance(TRIPLE_DES_TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, key);
        final byte[] retByte = cipher.doFinal(byteSrc);

        return new String(retByte);
    }
}
