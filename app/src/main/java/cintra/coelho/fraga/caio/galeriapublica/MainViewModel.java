package cintra.coelho.fraga.caio.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.io.Closeable;

public class MainViewModel extends AndroidViewModel {

    int navigationOpSelected = R.id.gridVewOp;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }
}
