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

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode(String name) {
        this.name = name;
    }

    public void add(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        children.remove(treeNode);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

}
