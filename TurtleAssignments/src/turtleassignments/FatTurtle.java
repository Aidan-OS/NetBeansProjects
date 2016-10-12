package turtleassignments;

// The "FatTurtle" class.
// For drawing graphics with a variety of line widths.
// This class extends the Turtle class.

import hsa.Console;

public class FatTurtle extends Turtle
{
    // Add a new variable.
    protected int lineWidth;

    // Only one version of constructor provided.
    public FatTurtle (Console c)
    {
	super (c);
	// Use default setting for other variables defined in Turtle class.
	lineWidth = 1;
    } // FatTurtle constructor


    // Add a new method to set LineWidth.
    public void setLineWidth (int newWidth)
    {
	lineWidth = newWidth;
    } // setLineWidth method


    // Draw a filled ball of radius and center at (x, y)
    // in the current color.
    protected void drawBall (int xc, int yc, int radius)
    {
	int diameter = radius * 2;
	int x = xc - radius;
	int y = yc - radius;
	c.fillOval (x, y, diameter, diameter);
    } // drawBall method


    // Add method drawFatLine.
    protected void drawFatLine (int x1, int y1, int x2, int y2)
    {
	// Line drawn by moving a ball point pen whose ball
	// is half line width.
	// Line drawn at x values of ball separated by DX which
	// is half the radius.
	// Constants used in calculation.
	final double LEN = Math.sqrt (((x2 - x1) * (x2 - x1)) + ((y2 - y1)
		    * (y2 - y1)));
	final double SINA = (y2 - y1) / LEN;
	final double COSA = (x2 - x1) / LEN;
	final int RADIUS = (lineWidth / 2) + 1;
	final double DX = RADIUS * COSA / 2;
	final double DY = RADIUS * SINA / 2;
	// Set position to draw first ball's center at (x1, y1).
	double xpos = x1;
	double ypos = y1;
	// Draw series of balls along line from (x1, y1) to (x2, y2).
	do
	{
	    drawBall ((int) Math.round (xpos), (int) Math.round (ypos),
		    RADIUS);
	    xpos += DX;
	    ypos += DY;
	}
	while (Math.sqrt ((x2 - xpos) * (x2 - xpos) + (y2 - ypos) * (y2 - ypos))
		>= RADIUS / 2);
    } // drawFatLine method


    // This method overrides the move method of the Turtle class.
    @Override
    public void move (int distance)
    {
	double rAngle = angle * Math.PI / 180;
	final int newx = (int) Math.round (x + Math.cos (rAngle) * distance);
	final int newy = (int) Math.round (y + Math.sin (rAngle) * distance);
	if (showing)
	{
	    c.setColor (clr);
	    if (lineWidth == 1)
		c.drawLine (x, y, newx, newy);
	    else
		drawFatLine (x, y, newx, newy);
	}
	x = newx;
	y = newy;
    } // move method
} /* FatTurtle class */
