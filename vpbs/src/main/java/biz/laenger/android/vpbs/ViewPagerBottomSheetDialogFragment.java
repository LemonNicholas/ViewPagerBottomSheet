package biz.laenger.android.vpbs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialogFragment;

public class ViewPagerBottomSheetDialogFragment extends BottomSheetDialogFragment {

    public ViewPagerBottomSheetDialog viewPagerBottomSheetDialog;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        viewPagerBottomSheetDialog = new ViewPagerBottomSheetDialog(getContext(), getTheme());
        return viewPagerBottomSheetDialog;
    }

}
