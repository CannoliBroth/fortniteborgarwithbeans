package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class CheezyIntake {

    private DcMotor Intake = null;
    private DcMotor Outtake = null;

    public CheezyIntake(CheezyMap robot){

        this.Intake = robot.intake;
        this.Outtake = robot.intake;

    }

    public void Letiteat(double leftTrigger, double rightTrigger){

        double intakePower    = Range.clip(leftTrigger, -1.0, 1.0) ;
        double outtakePower   = Range.clip(rightTrigger, -1.0, 1.0) ;
        Outtake.setPower(-outtakePower);
        Intake.setPower(intakePower);


    }

}
