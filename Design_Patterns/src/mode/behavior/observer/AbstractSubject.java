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

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author liwen
 * @date 2021-02-27
 * @since 1.0.0
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
