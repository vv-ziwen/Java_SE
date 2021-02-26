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
public class ObserverSub2 implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverSub2     update...");
    }
}
