import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@SessionScoped
public class YourManagedBean implements Serializable {
    private String selectedOption;
    private List<String> radioOptions;

    public YourManagedBean() {
        // ラジオボタンのオプションを初期化
        radioOptions = Arrays.asList("Option 1", "Option 2", "Option 3");
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public List<String> getRadioOptions() {
        return radioOptions;
    }

    public String submit() {
        // ラジオボタンの選択が行われた後の処理
        return "resultPage"; // 遷移先のページ名を返す
    }
}
