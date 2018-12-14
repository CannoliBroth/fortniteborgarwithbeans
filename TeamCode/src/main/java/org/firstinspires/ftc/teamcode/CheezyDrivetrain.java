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

    public void setAllMotors(DcMotor.RunMode mode) {
        leftBackDrive.setMode(mode);
        rightBackDrive.setMode(mode);
        leftFrontDrive.setMode(mode);
        rightFrontDrive.setMode(mode);
    }

    public int getLeftPosition() {
        return leftFrontDrive.getCurrentPosition();
    }

    public int getRightPosition() {
        return rightFrontDrive.getCurrentPosition();
    }

    public void setLeftTarget(int target) {
        leftBackDrive.setTargetPosition(target);
        leftFrontDrive.setTargetPosition(target);
    }

    public void setRightTarget(int target) {
        rightBackDrive.setTargetPosition(target);
        rightFrontDrive.setTargetPosition(target);
    }

    public void setRightPower(double power) {
        rightFrontDrive.setPower(power);
        rightBackDrive.setPower(power);
    }

    public void setLeftPower(double power) {
        leftFrontDrive.setPower(power);
        leftBackDrive.setPower(power);
    }

    public boolean leftIsBusy() {
        return (leftFrontDrive.isBusy() && leftBackDrive.isBusy());
    }

    public boolean rightIsBusy() {
        return (rightFrontDrive.isBusy() && rightBackDrive.isBusy());
    }


}

