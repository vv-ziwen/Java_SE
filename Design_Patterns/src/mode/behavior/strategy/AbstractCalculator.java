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


package mode.behavior.strategy;

/**
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String[] split = exp.split(opt);
        int[] ints = new int[2];
        ints[0] = Integer.parseInt(split[0]);
        ints[1] = Integer.parseInt(split[1]);
        return ints;
    }
}
