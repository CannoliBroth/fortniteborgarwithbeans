package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class CheezyArm {

    private DcMotor arm = null;

    public CheezyArm(CheezyMap robot) {
        this.arm = robot.arm;
    }

    public void flex(double leftTrigger, double rightTrigger) {
        if (rightTrigger != 0.0 && leftTrigger != 0.0) {
            arm.setPower(0.0);
        } else if (leftTrigger != 0.0) {
            arm.setPower(leftTrigger);
        } else if (rightTrigger != 1.0) {
            arm.setPower(-rightTrigger);
        } else {
            arm.setPower(0.0);
        }
    }
}
