
import java.util.Objects;

public class Movie {
	private String movieTitle;
	private int copyRemaining;

	public Movie(String movieTitle, int copyRemaining) {
		this.movieTitle = movieTitle;
		this.copyRemaining = copyRemaining;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public int getCopyRemaining() {
		return copyRemaining;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public void setCopyRemaining(int copyRemaining) {
		this.copyRemaining = copyRemaining;
	}

	@Override
	public String toString() {
		return "Movie Title: " + movieTitle + ". CopyRemaining: " + copyRemaining;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.movieTitle);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Movie other = (Movie) obj;
		if (!Objects.equals(this.movieTitle, other.movieTitle)) {
			return false;
		}
		return true;
	}

}
