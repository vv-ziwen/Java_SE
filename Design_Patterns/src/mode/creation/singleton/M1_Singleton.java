/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2021.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2021-02-25             liwen   Create the class
 * http://www.jimilab.com/
 */


package mode.creation.singleton;

/**
 * 创建模式之单例模式
 * 饿汉式单例 1
 * 优点： 没有加锁，执行效率高（比较推荐的方式）
 * 缺点：类加载就会初始化，浪费内存
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class M1_Singleton {

    /**
     * 静态单例
     */
    private static final M1_Singleton INSTANCE = new M1_Singleton();

    /**
     * 私有化构造器
     */
    private M1_Singleton() {}

    /**
     * 生成实例的方法
     */
    public static M1_Singleton getInstance() {return INSTANCE;}

    public void m() {System.out.println("do someThing...");}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(M1_Singleton.getInstance().hashCode())).start();
        }
    }

}
