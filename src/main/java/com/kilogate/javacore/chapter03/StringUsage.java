package com.kilogate.javacore.chapter03;

/**
 * StringUsage
 *
 * @author fengquanwei
 * @create 2020/3/25 上午12:35
 **/
public class StringUsage {
    public static void main(String[] args) {
        String string = "\uD835\uDD46 is the set of octonions";

        System.out.println(String.format("代码单元数量: %s", string.length()));
        System.out.println(String.format("码点数量: %s", string.codePointCount(0, string.length())));

        System.out.println(String.format("第0个代码单元: %s", string.charAt(0)));
        System.out.println(String.format("第0个码点: %s", string.codePointAt(0)));

        System.out.println(String.format("第1个码点的offset: %s", string.offsetByCodePoints(0, 1)));

        System.out.println("==================== 遍历字符串 ====================");

        for (int i = 0; i < string.length(); i++) {
            int codePoint = string.codePointAt(i);

            System.out.println(String.format("i: %s, s: %s", i, new String(new int[]{codePoint}, 0, 1)));

            if (Character.isSupplementaryCodePoint(codePoint)) {
                i++;
            }
        }

        // 字符串转码点数组
        int[] codePoints = string.codePoints().toArray();
        // 码点数组转字符串
        System.out.println(new String(codePoints, 0, codePoints.length));
    }
}
