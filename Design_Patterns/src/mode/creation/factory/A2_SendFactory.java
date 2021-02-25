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
 * 简单工厂 2
 * 改进版：选择不同方法创建不同对象
 * 描述：发送短信或邮件的工厂类
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class A2_SendFactory {

    public Sender smsProduce() {
        return new SmsSender();
    }

    public Sender emailProduce() {
        return new EmailSender();
    }

    public static void main(String[] args) {
        A2_SendFactory a1SendFactory = new A2_SendFactory();
        a1SendFactory.smsProduce().send();
        a1SendFactory.emailProduce().send();
    }
}
