package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class CheezyDrivetrain {

    public CheezyBotMotor leftFrontDrive;
    public CheezyBotMotor leftBackDrive;
    public CheezyBotMotor rightFrontDrive;
    public CheezyBotMotor rightBackDrive;

    public Telemetry getTelemetry() {
        return telemetry;
    }

    private float p;

    private static final float MAX_SPEED = .5f;
    private static final float MIN_SPEED = -.5f;

    private Telemetry telemetry;

    private boolean lastHeadingButton = false;

    private double lastHeading = 0;

    public CheezyGyro Gyro;

    public CheezyDrivetrain(CheezyBotMotor rightBackDrive, CheezyBotMotor rightFrontDrive, CheezyBotMotor leftBackDrive, CheezyBotMotor leftFrontDrive, CheezyGyro Gyro){
        this.leftBackDrive = leftBackDrive;
        this.leftFrontDrive = leftFrontDrive;
        this.rightBackDrive = rightBackDrive;
        this.rightFrontDrive = rightFrontDrive;
        this.Gyro = Gyro;
        this.p = 0.001f;
    }

    public void drive(float gamePad1LeftX, float gamePad1LeftY, float gamePad1RightX, boolean holdHeading){

        float turn = gamePad1RightX;
        if (!lastHeadingButton && holdHeading){
            lastHeading = Gyro.getAngle();
    }
        telemetry.addData("Gyro Angle", Gyro.getAngle());

        if(holdHeading){
        turn = (float)(Gyro.getAngle() - lastHeading) * p;
        telemetry.addData("Desired Angle", lastHeading);
    }

        telemetry.addData("Turn Magnitude", turn);

    driveHelper(gamePad1LeftX, gamePad1LeftY, turn);
    lastHeadingButton = holdHeading;
}

    private void driveHelper(float gamepad1LeftX, float gamepad1LeftY, float turnMagnitude ) {
        float lfPow = gamepad1LeftY + gamepad1LeftX - turnMagnitude;
        float lbPow = gamepad1LeftY - gamepad1LeftX - turnMagnitude;
        float rfPow = -gamepad1LeftY + gamepad1LeftX - turnMagnitude;
        float rbPow = -gamepad1LeftY - gamepad1LeftX - turnMagnitude;
        rfPow = Range.clip(rfPow*MAX_SPEED, MIN_SPEED, MAX_SPEED);
        lfPow = Range.clip(lfPow*MAX_SPEED, MIN_SPEED, MAX_SPEED);
        lbPow = Range.clip(lbPow*MAX_SPEED, MIN_SPEED, MAX_SPEED);
        rbPow = Range.clip(rbPow*MAX_SPEED, MIN_SPEED, MAX_SPEED);

        leftFrontDrive.setPower(lfPow);
        leftBackDrive.setPower(lbPow);
        rightFrontDrive.setPower(rfPow);
        rightBackDrive.setPower(rbPow);
    }

}

