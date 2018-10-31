package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.configuration.MotorType;

/**
 * Created by Brian Estevez on 11/19/2017.
 */

public class CheezyBotMotor {

    public DcMotor motor;

    private MotorType mt;

    private int countsPerRev;


    public enum MotorType {
        NeveRest,
        RevHDHex,;
    }

    public CheezyBotMotor(DcMotor dcMotor, MotorType mt){
        this.motor = dcMotor;
        setMotorType (mt);
        dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorType(MotorType mt){
        this.mt = mt;
        switch(mt){
            case NeveRest: countsPerRev = 1120;
                break;
            case RevHDHex: countsPerRev = 2240;
                break;
        }
    }

    public double getPower(){ return motor.getPower();}

    public void setPower(double power){
        motor.setPower(power);
    }


}