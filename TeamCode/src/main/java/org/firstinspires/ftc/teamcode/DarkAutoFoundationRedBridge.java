package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="\uD83C\uDFE2\uD83D\uDD34\uD83C\uDF09 Foundation Red Bridge", group="workingFoundation")
public class DarkAutoFoundationRedBridge extends SuperDark {

    @Override
    public void darkInit() {
        //
    }

    @Override
    public void darkRunning() {
        //TODO: In the future we need to comment what the auto is doing


        drive.driveDistance(DeadWheels.grabberSide, -68.0f, 0.7, 2.25f);
        foundServo.setPosition(1);
        sleep(1000);


        //drive.strafeRight(0.70);
        //timer.restart();
        //strafes to the right while the foundation is still in front of us
        //while (opModeIsActive() && timer.check() < 5 && distance.cmBack() < 25);
        //sleep(325);
        //goes for a little bit of extra time
        drive.goForwards(0.5);
        sleep(1000);
        drive.stopAll();

        drive.driveDistance(DeadWheels.grabberSide, 25.0f, 0.7, 2.25f);
        sleep(500);
        drive.stopAll();



        drive.newTurnTo(-90,1, 8);


        foundServo.setPosition(0.17); //~30 degrees from the 0 point - that being the top
        //wiggle to let go of the servo
        drive.newTurnTo(-90 ,1, 2);
        sleep(1000);

        drive.newTurnTo(90, 1, 8);

        //drive.driveDistance(DeadWheels.armSide, 10, 1, 2);
        drive.driveDistance(DeadWheels.grabberSide, 25, 1, 3);
        drive.newTurnTo(90, 1, 8);
        drive.driveDistance(DeadWheels.armSide, -25, 0.5, 2);
        drive.driveDistance(DeadWheels.grabberSide, -85, 1, 5);
        stop();

    }
}