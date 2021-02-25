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


package mode.creation.builder;

import mode.creation.factory.Sender;

/**
 * 创建模式之建造者模式
 * 建造者模式
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class SenderBuilder {
    private SenderBuilder(Builder builder) {
        this.sender = builder.sender;
    }

    private Sender sender;

    public Sender getSender() {
        return this.sender;
    }

    public static class Builder {
        private Sender sender;

        public Builder() {
        }

        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        public SenderBuilder build() {
            return new SenderBuilder(this);
        }
    }

}
