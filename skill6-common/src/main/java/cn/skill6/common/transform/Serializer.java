package cn.skill6.common.transform;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 序列化转换器
 *
 * @author 何明胜
 * @version 1.2
 * @since 2018年4月1日 下午10:07:26
 */
@Slf4j
public class Serializer {

    /**
     * 序列化对象
     *
     * @param object 对象
     * @return 字节数组
     */
    public static byte[] serialize(Object object) {
        if (object == null) {
            return null;
        }

        if (!(object instanceof Serializable)) {
            throw new IllegalArgumentException(
                    Serializer.class.getSimpleName()
                            + " requires a Serializable payload "
                            + "but received an object of type ["
                            + object.getClass().getName()
                            + "]");
        }

        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            log.error("serialize failed", e);
        }

        return null;
    }

    /**
     * 反序列化成对象
     *
     * @param byteArray 字节数组
     * @return 对象
     */
    public static Object unserialize(byte[] byteArray) {
        if (ArrayUtils.isEmpty(byteArray)) {
            return null;
        }

        ObjectInputStream objectInputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;

        try {
            byteArrayInputStream = new ByteArrayInputStream(byteArray);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();

            log.trace("deserialization success, result：{}", JacksonUtil.toStr(object));

            return object;
        } catch (Exception e) {
            log.error("deserialization failed", e);
        }

        return null;
    }

    /**
     * 序列化 list 集合
     *
     * @param list
     */
    public static byte[] serializeList(List<Object> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        byte[] byteArray = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            for (Object obj : list) {
                oos.writeObject(obj);
            }
            byteArray = baos.toByteArray();
        } catch (Exception e) {
            log.error("serialize failed", e);
        }

        return byteArray;
    }

    /**
     * 反序列化 list 集合
     *
     * @param bytes 字节数组
     */
    public static List<Object> unserializeList(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        List<Object> list = new ArrayList<>();
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            while (bais.available() > 0) {
                Object obj = (Object) ois.readObject();
                if (obj == null) {
                    break;
                }
                list.add(obj);
            }
        } catch (Exception e) {
            log.error("deserialization list failed", e);
        }

        return list;
    }

    /**
     * 序列化 set 集合
     *
     * @param set 集合
     */
    public static byte[] serializeSet(Set<Object> set) {
        if (set.isEmpty()) {
            return null;
        }
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        byte[] byteArray = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            for (Object obj : set) {
                oos.writeObject(obj);
            }
            byteArray = baos.toByteArray();
        } catch (Exception e) {
            log.error("serialize failed", e);
        }

        return byteArray;
    }

    /**
     * 反序列化 set 集合
     *
     * @param bytes 字节数组
     */
    public static Set<Object> unserializeSet(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        Set<Object> set = new HashSet<>();
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            while (bais.available() > 0) {
                Object obj = (Object) ois.readObject();
                if (obj == null) {
                    break;
                }
                set.add(obj);
            }
        } catch (Exception e) {
            log.error("deserialization failed", e);
        }

        return set;
    }
}
