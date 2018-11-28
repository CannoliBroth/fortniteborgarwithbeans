package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class CheezyDrivetrain {


    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftFrontDrive = null;
    private DcMotor rightBackDrive = null;

    public CheezyDrivetrain(CheezyMap robot){

        this.leftFrontDrive = robot.leftFrontDrive;
        this.leftBackDrive = robot.leftBackDrive;
        this.rightBackDrive = robot.rightBackDrive;
        this.rightFrontDrive = robot.rightFrontDrive;
    }

    public void drivey(double leftTrigger, double rightTrigger, double leftX){
        double leftPower    = Range.clip(rightTrigger - leftTrigger + leftX, -1.0, 1.0) ;
        double rightPower   = Range.clip(rightTrigger - leftTrigger - leftX, -1.0, 1.0) ;
        leftFrontDrive.setPower(leftPower);
        rightFrontDrive.setPower(rightPower);
        leftBackDrive.setPower(leftPower);
        rightBackDrive.setPower(rightPower);
        //telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);


    }

}

