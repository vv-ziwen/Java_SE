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


package mode.structural.decorator;

/**
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class Source implements Sourceable {
    @Override
    public void m1() {
        System.out.println("this is source method!");
    }
}
