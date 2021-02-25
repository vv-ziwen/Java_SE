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


package mode.structural.flyweight;

import java.util.Vector;

/**
 * 行为模式之享元模式
 * 参考数据库连接池
 * 优点：
 * 不需要每一次重新创建对象，减少OS的开销，提示性能q
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public class ConnectionPool {

    private Vector<Object> pool;

    private int poolSize = 10;

    private Object conn;

    private ConnectionPool() {
        pool = new Vector<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            Object conn = new Object();
            pool.add(conn);
        }
    }

    public synchronized Object getConn() {
        if (pool.size() > 0) {
            Object o = pool.get(0);
            pool.remove(o);
            return o;
        }
        return null;
    }
}
