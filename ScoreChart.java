public class ScoreChart {

    private int[][] _scores;
    private int[][] _vd;
    
    public ScoreChart(int k) {
	_scores = new int[k][k];
	_vd = new int[k][k];
	for (int i=0; i<k; i++) {
	    _scores[i][i] = -1;
	}
    }

    public void append(int i, int s1, int j, int s2) {
	_scores[i][j] = s1;
	_scores[j][i] = s2;
	if (s1>s2) {
	    _vd[i][j] = 1;
	    _vd[j][i] = -1;
	}
	else if (s2>s1) {
	    _vd[i][j] = -1;
	    _vd[j][i] = 1;
	}
	else {
	    _vd[i][j] = 0;
	    _vd[j][i] = 0;
	}
    }

    public String toString() {
	String retStr = ",";
	for (int i=0; i<_scores.length; i++) {
	    retStr += "S" + i + ",";
	}
	retStr += "\n";
	for (int i=0; i<_scores.length; i++) {
	    retStr += "S" + i + ",";
	    for (int j=0; j<_scores.length; j++) {		
		retStr += _scores[i][j] + ",";
	    }
	    retStr += "\n";
	}

	retStr += "\n";
	for (int i=0; i<_vd.length; i++) {
	    retStr += "S" + i + ",";
	}
	retStr += "\n";
	for (int i=0; i<_vd.length; i++) {
	    retStr += "S" + i + ",";
	    for (int j=0; j<_vd.length; j++) {		
		retStr += _vd[i][j] + ",";
	    }
	    retStr += "\n";
	}
	
	return retStr;
    }

}
