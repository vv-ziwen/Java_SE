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

import java.util.concurrent.TimeUnit;

/**
 * 创建模式之单例模式
 * 懒汉式单例 2
 * 优点： 第一次调用才初始化，避免内存浪费。（比较完美的写法）
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class M6_Singleton {

    /**
     * 静态单例
     */
    private static volatile M6_Singleton INSTANCE;

    /**
     * 私有化构造器
     */
    private M6_Singleton() {}

    /**
     * 生成实例的方法(双层检查)
     */
    public static M6_Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (M6_Singleton.class) {
                if (INSTANCE == null) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new M6_Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {System.out.println("do someThing...");}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(M6_Singleton.getInstance().hashCode())).start();
        }
    }

}
