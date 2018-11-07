package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class CheezyIntake {

    private DcMotor Intake = null;

    public CheezyIntake(CheezyMap robot){

        this.Intake = robot.intake;

    }

    public void Letiteat(double leftTrigger){

        double leftPower    = Range.clip(leftTrigger, -1.0, 1.0) ;
        Intake.setPower(leftPower);

    }

}
