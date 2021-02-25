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
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public class Tree {

    private TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public TreeNode getRoot() {
        return root;
    }
}
