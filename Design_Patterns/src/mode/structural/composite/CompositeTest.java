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
 * 2021-02-26             liwen   Create the class
 * http://www.jimilab.com/
 */


package mode.structural.composite;

/**
 * 行为模式之组合模式
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public class CompositeTest {

    public static void main(String[] args) {
        Tree t1 = new Tree("A");
        TreeNode t2 = new TreeNode("B");
        TreeNode t3 = new TreeNode("C");

        t2.add(t3);
        t1.getRoot().add(t2);
        System.out.println(t1.getRoot().getChildren());
    }
}
