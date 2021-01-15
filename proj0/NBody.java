public class NBody {
	public static double readRadius(String name) {
		In in = new In(name);
		int numPlanet = in.readInt();
		double radius = in.readDouble();
		return radius;
	}

	public static Planet[] readPlanets(String name) {
		In in = new In(name);
		int numPlanet = in.readInt();
		double radius = in.readDouble();
		Planet[] planets = new Planet[numPlanet];
		for (int i=0; i<numPlanet; i++) {
			planets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString() );
		}
		return planets;
	}

	public static void main(String[] args) {
		double T = Double.parseDouble(args[0]);
		double dt = Double.parseDouble(args[1]);
		String filename = args[2];
		double radius = readRadius(filename);
		Planet[] planets = readPlanets(filename);
		String bg = "./images/starfield.jpg";
		StdDraw.setScale(-radius, radius);
		StdDraw.enableDoubleBuffering();
		for (int t = 0; t<T; t += dt) {
			// StdDraw.clear();
			StdDraw.picture(0, 0, bg);
			// update of each planets
			for (Planet p: planets) {
			double xForces = p.calcNetForceExertedByX(planets);
			double yForces = p.calcNetForceExertedByY(planets);
			p.update(dt, xForces, yForces);
			// draw bg, planets, show offscreen buffer
			p.draw();
			StdDraw.show();
			StdDraw.pause(10);
			}

		}

	}
}

