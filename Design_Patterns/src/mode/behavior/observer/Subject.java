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
 * 2021-02-27             liwen   Create the class
 * http://www.jimilab.com/
 */


package mode.behavior.observer;

/**
 * @author liwen
 * @date 2021-02-27
 * @since 1.0.0
 */
public interface Subject {
    /**
     * 新增观察者
     */
    void add(Observer observer);

    /**
     * 删除观察者
     */
    void del(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObserver();

    /**
     * 操作
     */
    void operation();
}
