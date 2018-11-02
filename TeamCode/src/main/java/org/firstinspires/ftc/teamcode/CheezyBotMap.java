package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.motors.RevRobotics20HdHexMotor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class CheezyBotMap {

    DcMotor leftFrontMotor;
    DcMotor rightFrontMotor;
    DcMotor rightBackMotor;
    DcMotor leftBackMotor;
    BNO055IMU Gyro;

    HardwareMap Cheezyzone;

    public CheezyBotMap(){

    }

    public void init(HardwareMap hardwareMap){

        this.Cheezyzone = hardwareMap;

        leftFrontMotor = Cheezyzone.get(DcMotor.class,"TakeLF");
        rightFrontMotor = Cheezyzone.get(DcMotor.class,"TakeRF");
        rightBackMotor = Cheezyzone.get(DcMotor.class, "TakeRB");
        leftBackMotor = Cheezyzone.get(DcMotor.class, "TakeLB");
        Gyro = Cheezyzone.get(BNO055IMU.class,"Gyro");
    }
}