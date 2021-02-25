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
 * 枚举方式
 * 优点：简单、安全
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class M8_Singleton {

    enum InnerEnum {
        INSTANCE;

        public static InnerEnum getInstance() {
            return INSTANCE;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(InnerEnum.getInstance().hashCode())).start();
        }
    }
}
