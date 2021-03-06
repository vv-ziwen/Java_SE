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


package mode.creation.factory;

/**
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public interface Provider {
    /**
     * 抽象生成对象方法
     * @return mode.creation.factory.factoryMethod.Sender
     * @author liwen
     * @date 2021/2/25 22:27
     */
    Sender produce();
}
