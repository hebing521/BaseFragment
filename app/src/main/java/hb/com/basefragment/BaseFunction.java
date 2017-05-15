package hb.com.basefragment;

import android.text.TextUtils;

import java.util.HashMap;

/**
 * Created by HeBing on 2017/5/15 21:41
 */

public class Functions {

    HashMap<String, FunctionNoParamNoResult> mFunctionNoParamNoResultMap = new HashMap<>();

    public class Function {
        String functionName;

        public Function(String functionName) {
            this.functionName = functionName;
        }
    }


    public abstract class FunctionNoParamNoResult extends Function {

        public FunctionNoParamNoResult(String name) {
            super(name);
        }

        public abstract void Fucntion();
    }


    public void invokeFunc(String funcName) {
        if (TextUtils.isEmpty(funcName)) {

            return;
        }


        if (mFunctionNoParamNoResultMap != null) {
            FunctionNoParamNoResult func = mFunctionNoParamNoResultMap.get(funcName);
            if (func != null) {
                func.Fucntion();
            } else {
                throw new NoFunctionException("no this Function");
            }
        }
    }
}
