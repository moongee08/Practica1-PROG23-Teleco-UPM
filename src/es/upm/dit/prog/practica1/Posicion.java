package es.upm.dit.prog.practica1;

import java.util.Objects;

public class Posicion {
	private double latitud;
	private double longitud;
	private double altura;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Posicion(double latitud, double longitud, double altura) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.altura = altura;
	}

    public double getLatitud() {
	    return latitud;
    }

    public void setLatitud(double latitud) {
	    this.latitud = latitud;
    }

    public double getLongitud() {
	    return longitud;
    }

    public void setLongitud(double longitud) {
	    this.longitud = longitud;
    }

    public double getAltura() {
	    return altura;
    }

    public void setAltura(double altura) {
	    this.altura = altura;
    }

	@Override
	public String toString() {
		return "Posicion [latitud=" + latitud + ", longitud=" + longitud + ", altura=" + altura + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	public double getX() {
		return this.altura * Math.cos(this.latitud) * Math.cos(this.longitud);
	}
	public double getY() {
		return this.altura * Math.cos(this.latitud) * Math.sin(this.longitud);
	}
	public double getZ() {
		return this.altura * Math.sin(this.latitud);
	}
	public double distancia(Posicion otra) {
		double x = this.getX() - otra.getX();
		double y = this.getY() - otra.getY();
		double z = this.getZ() - otra.getZ();
		if( otra == null ) {
			return 0.0;
		}
		double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
		return dist;
	}
}
