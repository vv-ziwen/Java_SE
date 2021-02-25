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
 * 简单工厂 1
 * 描述：发送短信或邮件的工厂类
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class A1_SendFactory {

    public Sender produce(String type) {
        // 发送短信
        if (type.equals("sms")) {
            return new SmsSender();
        }
        // 发送邮件
        else if (type.equals("email")) {
            return new EmailSender();
        }
        // 不发送
        else {
            System.out.println("类型不正确");
            return null;
        }
    }

    public static void main(String[] args) {
        A1_SendFactory a1SendFactory = new A1_SendFactory();
        a1SendFactory.produce("email").send();
        a1SendFactory.produce("sms").send();
    }
}
