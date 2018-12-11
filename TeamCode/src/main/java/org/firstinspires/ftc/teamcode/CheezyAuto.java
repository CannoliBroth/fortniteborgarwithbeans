package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import static android.os.SystemClock.sleep;

@Autonomous(name="RiseAndGrind", group="AutoMode")
public class CheezyAuto extends OpMode {
    private ElapsedTime runtime = new ElapsedTime();
    CheezyMap robot;
    CheezyDrivetrain drivey;
    CheezyIntake Letiteat;
    CheezyArm flex;

    static final double     FORWARD_SPEED = 0.6;
   // static final double     TURN_SPEED    = 0.5;

    @Override
    public void init() {
        robot = new CheezyMap(hardwareMap);
        robot.init();
        drivey = new CheezyDrivetrain(robot);
        Letiteat = new CheezyIntake(robot);
        flex = new CheezyArm(robot);

    }
    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
        runtime.reset();
    }

    @Override
    public void loop() {
        robot.leftFrontDrive.setPower(FORWARD_SPEED);
        robot.rightFrontDrive.setPower(-FORWARD_SPEED);
        robot.leftBackDrive.setPower(FORWARD_SPEED);
        robot.rightBackDrive.setPower(-FORWARD_SPEED);
        runtime.reset();
        while ( (runtime.seconds() < 3.0));


        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }

}


