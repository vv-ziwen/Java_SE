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


package mode.structural.facade;

/**
 * @author liwen
 * @date 2021-02-25
 * @since 1.0.0
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startUp() {
        System.out.println("Computer start");
        cpu.startUp();
        disk.startUp();
        memory.startUp();
        System.out.println("Computer start finally");
    }

    public void shutDown() {
        System.out.println("Computer shutDown");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("Computer shutDown finally");
    }

}
