package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class CheezyMap {

    public DcMotor leftBackDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor leftFrontDrive = null;
    public DcMotor rightBackDrive = null;
    public DcMotor intake = null;
    public DcMotor arm = null;

    public CheezyMap(HardwareMap hardwareMap){
        leftFrontDrive  = hardwareMap.get(DcMotor.class, "leftFronty");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightFronty");
        leftBackDrive  = hardwareMap.get(DcMotor.class, "leftBacky");
        rightBackDrive = hardwareMap.get(DcMotor.class, "rightBacky");
        intake = hardwareMap.get(DcMotor.class, "Intake");
        arm = hardwareMap.get(DcMotor.class, "Arm");
    }
    public void init() {
        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);
        intake.setDirection(DcMotor.Direction.FORWARD);
        arm.setDirection(DcMotor.Direction.FORWARD);
    }

}
