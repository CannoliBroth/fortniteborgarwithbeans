package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.sun.tools.javac.util.Position;

public class ICE {

    private Servo beanFlicker = null;
    private double beanCount;

    public ICE(CheezyMap robot){
        this.beanFlicker = robot.ICE;
        this.beanCount = 0.5;
    }
    public void Border(boolean ButtonA, boolean ButtonB){
        if(ButtonA){
            this.beanCount = 1.0;
        }
        if(ButtonB){
            this.beanCount = 0.5;
        }
        beanFlicker.setPosition(beanCount);
    }

}



