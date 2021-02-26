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


package mode.structural.adapter;

/**
 * 结构模式之适配器模式
 * 类适配器、对象适配器、接口适配器
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class AdapterTest {

    public static void main(String[] args) {
        classAdapterTest();
        objectAdapterTest();
        interfaceAdapterTest();
    }

    private static void classAdapterTest() {
        ClassAdapter adapter = new ClassAdapter();
        adapter.m1();
        adapter.m2();
    }

    private static void objectAdapterTest() {
        ObjectAdapter adapter = new ObjectAdapter(new Source());
        adapter.m1();
        adapter.m2();
    }

    private static void interfaceAdapterTest() {
        InterfaceAdapter1 adapter1 = new InterfaceAdapter1();
        InterfaceAdapter2 adapter2 = new InterfaceAdapter2();

        adapter1.m1();
        adapter1.m2();

        adapter2.m1();
        adapter2.m2();
    }

}
