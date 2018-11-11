package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class CheezyIntake {

    private DcMotor intake = null;
    private static final double INTAKE_POWER = 1.0;
    private static final double OUTTAKE_POWER = -1.0;
    public CheezyIntake(CheezyMap robot){

        this.intake = robot.intake;

    }

    public void Letiteat(boolean leftBumper, boolean rightBumper){
        if(leftBumper && rightBumper){
            intake.setPower(0.0);
        }
        else if(leftBumper){
            intake.setPower(INTAKE_POWER);
        }
        else if(rightBumper){
            intake.setPower(OUTTAKE_POWER);
        }
        else{
            intake.setPower(0.0);
        }



    }

}
