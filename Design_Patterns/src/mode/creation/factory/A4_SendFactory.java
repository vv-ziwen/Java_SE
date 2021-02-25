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
 * 创建模式之工厂模式
 * 抽象工厂
 * 描述：发送短信或邮件的工厂类
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class A4_SendFactory {

    public static void main(String[] args) {
        Provider provider1 = new SendMailFactory();
        provider1.produce().send();
        Provider provider2 = new SendSmsFactory();
        provider2.produce().send();
    }
}
