package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.CheezyBotMotor.MotorType;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class CheezyBot {

    public CheezyBotMotor leftFrontDrive;
    public CheezyBotMotor leftBackDrive;
    public CheezyBotMotor rightFrontDrive;
    public CheezyBotMotor rightBackDrive;

    public CheezyDrivetrain drivetrain;

    public CheezyGyro gyro;


    public CheezyBot(HardwareMap hardwareMap, Telemetry telemetry) {
        CheezyBotMap hardware = new CheezyBotMap();
        hardware.init(hardwareMap);

        rightFrontDrive = new CheezyBotMotor(hardware.rightFrontMotor, MotorType.RevHDHex);
        rightBackDrive = new CheezyBotMotor(hardware.rightBackMotor, MotorType.RevHDHex);
        leftFrontDrive = new CheezyBotMotor(hardware.leftFrontMotor, MotorType.RevHDHex);
        leftBackDrive = new CheezyBotMotor(hardware.leftBackMotor, MotorType.RevHDHex);
        drivetrain = new CheezyDrivetrain(leftBackDrive, leftBackDrive, rightBackDrive, rightFrontDrive, gyro);
        gyro = new CheezyGyro(hardware.Gyro);

    }
}
