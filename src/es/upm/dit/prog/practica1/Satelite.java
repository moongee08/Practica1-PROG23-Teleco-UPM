package es.upm.dit.prog.practica1;

public class Satelite {
	private String id;
	private Posicion pos;
	private long t;
	private Posicion pos0;
	private long t0;
	public Satelite(String id, Posicion pos, long t, Posicion pos0, long t0) {
		this.id = id;
		this.t = t;
		this.t0 = t0;
		if (pos == null) {
			this.pos = new Posicion(0,0,0);
		}
		else {
			this.pos = pos;
		}
		if (pos0 == null) {
			this.pos0 = new Posicion(0,0,0);
		}else {
			this.pos0 = pos0;
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Posicion getPos() {
		return pos;
	}
	public void setPos(Posicion pos) {
		this.pos = pos;
	}
	public long getT() {
		return t;
	}
	public void setT(long t) {
		this.t = t;
	}
	public Posicion getPos0() {
		return pos0;
	}
	public void setPos0(Posicion pos0) {
		this.pos0 = pos0;
	}
	public long getT0() {
		return t0;
	}
	public void setT0(long t0) {
		this.t0 = t0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Satelite other = (Satelite) obj;
		return Objects.equals(id, other.id) && Objects.equals(pos, other.pos) && Objects.equals(pos0, other.pos0)
				&& t == other.t && t0 == other.t0;
	}

	@Override
	public String toString() {
		return "Satelite [id=" + id + ", pos=" + pos + ", t=" + t + ", pos0=" + pos0 + ", t0=" + t0 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
