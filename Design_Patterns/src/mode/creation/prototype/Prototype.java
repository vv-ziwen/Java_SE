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


package mode.creation.prototype;

import java.io.*;

/**
 * 创建模式之原型模式
 * 深浅复制
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = -4360924002552805815L;

    private String str;

    private SerializableObject object;

    /**
     * 浅复制
     * @return java.lang.Object
     * @author liwen
     * @date 2021/2/25 23:01
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深复制
     * @return java.lang.Object
     * @author liwen
     * @date 2021/2/25 23:03
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读取二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}


class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}