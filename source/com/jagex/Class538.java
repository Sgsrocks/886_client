/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class538
{
    public static String aString7179;
    
    public static byte[][][] method8880(int i) {
	byte[][][] is = new byte[8][4][];
	int i_0_ = i;
	int i_1_ = i;
	byte[] is_2_ = new byte[i_0_ * i_1_];
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
	    for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
		if (i_5_ <= i_4_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
	    for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
		if (i_7_ <= i_6_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		if (i_9_ >= i_8_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_10_ = i_1_ - 1; i_10_ >= 0; i_10_--) {
	    for (int i_11_ = 0; i_11_ < i_0_; i_11_++) {
		if (i_11_ >= i_10_)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[0][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_12_ = i_1_ - 1; i_12_ >= 0; i_12_--) {
	    for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
		if (i_13_ <= i_12_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
	    for (int i_15_ = 0; i_15_ < i_0_; i_15_++) {
		if (i_3_ < 0 || i_3_ >= is_2_.length)
		    i_3_++;
		else {
		    if (i_15_ >= i_14_ << 1)
			is_2_[i_3_] = (byte) -1;
		    i_3_++;
		}
	    }
	}
	is[1][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
	    for (int i_17_ = i_0_ - 1; i_17_ >= 0; i_17_--) {
		if (i_17_ <= i_16_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
	    for (int i_19_ = i_0_ - 1; i_19_ >= 0; i_19_--) {
		if (i_19_ >= i_18_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[1][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
	    for (int i_21_ = i_0_ - 1; i_21_ >= 0; i_21_--) {
		if (i_21_ <= i_20_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = 0; i_23_ < i_0_; i_23_++) {
		if (i_23_ >= i_22_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_24_ = 0; i_24_ < i_1_; i_24_++) {
	    for (int i_25_ = 0; i_25_ < i_0_; i_25_++) {
		if (i_25_ <= i_24_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_26_ = 0; i_26_ < i_1_; i_26_++) {
	    for (int i_27_ = i_0_ - 1; i_27_ >= 0; i_27_--) {
		if (i_27_ >= i_26_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[2][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
	    for (int i_29_ = 0; i_29_ < i_0_; i_29_++) {
		if (i_29_ >= i_28_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
	    for (int i_31_ = 0; i_31_ < i_0_; i_31_++) {
		if (i_31_ <= i_30_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][1] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
	    for (int i_33_ = i_0_ - 1; i_33_ >= 0; i_33_--) {
		if (i_33_ >= i_32_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
	    for (int i_35_ = i_0_ - 1; i_35_ >= 0; i_35_--) {
		if (i_35_ <= i_34_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[3][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
	    for (int i_37_ = i_0_ - 1; i_37_ >= 0; i_37_--) {
		if (i_37_ >= i_36_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
	    for (int i_39_ = 0; i_39_ < i_0_; i_39_++) {
		if (i_39_ <= i_38_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
	    for (int i_41_ = 0; i_41_ < i_0_; i_41_++) {
		if (i_41_ >= i_40_ >> 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
	    for (int i_43_ = i_0_ - 1; i_43_ >= 0; i_43_--) {
		if (i_43_ <= i_42_ << 1)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[4][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_44_ = 0; i_44_ < i_1_; i_44_++) {
	    for (int i_45_ = 0; i_45_ < i_0_; i_45_++) {
		if (i_45_ <= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_46_ = 0; i_46_ < i_1_; i_46_++) {
	    for (int i_47_ = 0; i_47_ < i_0_; i_47_++) {
		if (i_46_ <= i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
	    for (int i_49_ = 0; i_49_ < i_0_; i_49_++) {
		if (i_49_ >= i_0_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_0_; i_51_++) {
		if (i_50_ >= i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[5][3] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_52_ = 0; i_52_ < i_1_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_0_; i_53_++) {
		if (i_53_ <= i_52_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][0] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_54_ = i_1_ - 1; i_54_ >= 0; i_54_--) {
	    for (int i_55_ = 0; i_55_ < i_0_; i_55_++) {
		if (i_55_ <= i_54_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_56_ = i_1_ - 1; i_56_ >= 0; i_56_--) {
	    for (int i_57_ = i_0_ - 1; i_57_ >= 0; i_57_--) {
		if (i_57_ <= i_56_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][2] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_58_ = 0; i_58_ < i_1_; i_58_++) {
	    for (int i_59_ = i_0_ - 1; i_59_ >= 0; i_59_--) {
		if (i_59_ <= i_58_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[6][3] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_60_ = 0; i_60_ < i_1_; i_60_++) {
	    for (int i_61_ = 0; i_61_ < i_0_; i_61_++) {
		if (i_61_ >= i_60_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][0] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_62_ = i_1_ - 1; i_62_ >= 0; i_62_--) {
	    for (int i_63_ = 0; i_63_ < i_0_; i_63_++) {
		if (i_63_ >= i_62_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][1] = is_2_;
	is_2_ = new byte[i_0_ * i_1_];
	i_3_ = 0;
	for (int i_64_ = i_1_ - 1; i_64_ >= 0; i_64_--) {
	    for (int i_65_ = i_0_ - 1; i_65_ >= 0; i_65_--) {
		if (i_65_ >= i_64_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][2] = is_2_;
	is_2_ = new byte[i_1_ * i_0_];
	i_3_ = 0;
	for (int i_66_ = 0; i_66_ < i_1_; i_66_++) {
	    for (int i_67_ = i_0_ - 1; i_67_ >= 0; i_67_--) {
		if (i_67_ >= i_66_ - i_1_ / 2)
		    is_2_[i_3_] = (byte) -1;
		i_3_++;
	    }
	}
	is[7][3] = is_2_;
	return is;
    }
    
    public static byte[][][] method8881(int i) {
	byte[][][] is = new byte[8][4][];
	int i_68_ = i;
	int i_69_ = i;
	byte[] is_70_ = new byte[i_68_ * i_69_];
	int i_71_ = 0;
	for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
	    for (int i_73_ = 0; i_73_ < i_68_; i_73_++) {
		if (i_73_ <= i_72_)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[0][0] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_74_ = i_69_ - 1; i_74_ >= 0; i_74_--) {
	    for (int i_75_ = 0; i_75_ < i_69_; i_75_++) {
		if (i_75_ <= i_74_)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[0][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_76_ = 0; i_76_ < i_69_; i_76_++) {
	    for (int i_77_ = 0; i_77_ < i_68_; i_77_++) {
		if (i_77_ >= i_76_)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[0][2] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_78_ = i_69_ - 1; i_78_ >= 0; i_78_--) {
	    for (int i_79_ = 0; i_79_ < i_68_; i_79_++) {
		if (i_79_ >= i_78_)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[0][3] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_80_ = i_69_ - 1; i_80_ >= 0; i_80_--) {
	    for (int i_81_ = 0; i_81_ < i_68_; i_81_++) {
		if (i_81_ <= i_80_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[1][0] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_82_ = 0; i_82_ < i_69_; i_82_++) {
	    for (int i_83_ = 0; i_83_ < i_68_; i_83_++) {
		if (i_71_ < 0 || i_71_ >= is_70_.length)
		    i_71_++;
		else {
		    if (i_83_ >= i_82_ << 1)
			is_70_[i_71_] = (byte) -1;
		    i_71_++;
		}
	    }
	}
	is[1][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_84_ = 0; i_84_ < i_69_; i_84_++) {
	    for (int i_85_ = i_68_ - 1; i_85_ >= 0; i_85_--) {
		if (i_85_ <= i_84_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[1][2] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_86_ = i_69_ - 1; i_86_ >= 0; i_86_--) {
	    for (int i_87_ = i_68_ - 1; i_87_ >= 0; i_87_--) {
		if (i_87_ >= i_86_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[1][3] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_88_ = i_69_ - 1; i_88_ >= 0; i_88_--) {
	    for (int i_89_ = i_68_ - 1; i_89_ >= 0; i_89_--) {
		if (i_89_ <= i_88_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[2][0] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_90_ = i_69_ - 1; i_90_ >= 0; i_90_--) {
	    for (int i_91_ = 0; i_91_ < i_68_; i_91_++) {
		if (i_91_ >= i_90_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[2][1] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_92_ = 0; i_92_ < i_69_; i_92_++) {
	    for (int i_93_ = 0; i_93_ < i_68_; i_93_++) {
		if (i_93_ <= i_92_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[2][2] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_94_ = 0; i_94_ < i_69_; i_94_++) {
	    for (int i_95_ = i_68_ - 1; i_95_ >= 0; i_95_--) {
		if (i_95_ >= i_94_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[2][3] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_96_ = i_69_ - 1; i_96_ >= 0; i_96_--) {
	    for (int i_97_ = 0; i_97_ < i_68_; i_97_++) {
		if (i_97_ >= i_96_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[3][0] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_98_ = 0; i_98_ < i_69_; i_98_++) {
	    for (int i_99_ = 0; i_99_ < i_68_; i_99_++) {
		if (i_99_ <= i_98_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[3][1] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_100_ = 0; i_100_ < i_69_; i_100_++) {
	    for (int i_101_ = i_68_ - 1; i_101_ >= 0; i_101_--) {
		if (i_101_ >= i_100_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[3][2] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_102_ = i_69_ - 1; i_102_ >= 0; i_102_--) {
	    for (int i_103_ = i_68_ - 1; i_103_ >= 0; i_103_--) {
		if (i_103_ <= i_102_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[3][3] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_104_ = i_69_ - 1; i_104_ >= 0; i_104_--) {
	    for (int i_105_ = i_68_ - 1; i_105_ >= 0; i_105_--) {
		if (i_105_ >= i_104_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[4][0] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_106_ = i_69_ - 1; i_106_ >= 0; i_106_--) {
	    for (int i_107_ = 0; i_107_ < i_68_; i_107_++) {
		if (i_107_ <= i_106_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[4][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_108_ = 0; i_108_ < i_69_; i_108_++) {
	    for (int i_109_ = 0; i_109_ < i_68_; i_109_++) {
		if (i_109_ >= i_108_ >> 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[4][2] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_110_ = 0; i_110_ < i_69_; i_110_++) {
	    for (int i_111_ = i_68_ - 1; i_111_ >= 0; i_111_--) {
		if (i_111_ <= i_110_ << 1)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[4][3] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_112_ = 0; i_112_ < i_69_; i_112_++) {
	    for (int i_113_ = 0; i_113_ < i_68_; i_113_++) {
		if (i_113_ <= i_68_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[5][0] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_114_ = 0; i_114_ < i_69_; i_114_++) {
	    for (int i_115_ = 0; i_115_ < i_68_; i_115_++) {
		if (i_114_ <= i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[5][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_116_ = 0; i_116_ < i_69_; i_116_++) {
	    for (int i_117_ = 0; i_117_ < i_68_; i_117_++) {
		if (i_117_ >= i_68_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[5][2] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_118_ = 0; i_118_ < i_69_; i_118_++) {
	    for (int i_119_ = 0; i_119_ < i_68_; i_119_++) {
		if (i_118_ >= i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[5][3] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_120_ = 0; i_120_ < i_69_; i_120_++) {
	    for (int i_121_ = 0; i_121_ < i_68_; i_121_++) {
		if (i_121_ <= i_120_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[6][0] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_122_ = i_69_ - 1; i_122_ >= 0; i_122_--) {
	    for (int i_123_ = 0; i_123_ < i_68_; i_123_++) {
		if (i_123_ <= i_122_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[6][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_124_ = i_69_ - 1; i_124_ >= 0; i_124_--) {
	    for (int i_125_ = i_68_ - 1; i_125_ >= 0; i_125_--) {
		if (i_125_ <= i_124_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[6][2] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_126_ = 0; i_126_ < i_69_; i_126_++) {
	    for (int i_127_ = i_68_ - 1; i_127_ >= 0; i_127_--) {
		if (i_127_ <= i_126_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[6][3] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_128_ = 0; i_128_ < i_69_; i_128_++) {
	    for (int i_129_ = 0; i_129_ < i_68_; i_129_++) {
		if (i_129_ >= i_128_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[7][0] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_130_ = i_69_ - 1; i_130_ >= 0; i_130_--) {
	    for (int i_131_ = 0; i_131_ < i_68_; i_131_++) {
		if (i_131_ >= i_130_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[7][1] = is_70_;
	is_70_ = new byte[i_68_ * i_69_];
	i_71_ = 0;
	for (int i_132_ = i_69_ - 1; i_132_ >= 0; i_132_--) {
	    for (int i_133_ = i_68_ - 1; i_133_ >= 0; i_133_--) {
		if (i_133_ >= i_132_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[7][2] = is_70_;
	is_70_ = new byte[i_69_ * i_68_];
	i_71_ = 0;
	for (int i_134_ = 0; i_134_ < i_69_; i_134_++) {
	    for (int i_135_ = i_68_ - 1; i_135_ >= 0; i_135_--) {
		if (i_135_ >= i_134_ - i_69_ / 2)
		    is_70_[i_71_] = (byte) -1;
		i_71_++;
	    }
	}
	is[7][3] = is_70_;
	return is;
    }
    
    Class538() throws Throwable {
	throw new Error();
    }
    
    public static byte[][][] method8882(int i) {
	byte[][][] is = new byte[8][4][];
	int i_136_ = i;
	int i_137_ = i;
	byte[] is_138_ = new byte[i_136_ * i_137_];
	int i_139_ = 0;
	for (int i_140_ = 0; i_140_ < i_137_; i_140_++) {
	    for (int i_141_ = 0; i_141_ < i_136_; i_141_++) {
		if (i_141_ <= i_140_)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[0][0] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_142_ = i_137_ - 1; i_142_ >= 0; i_142_--) {
	    for (int i_143_ = 0; i_143_ < i_137_; i_143_++) {
		if (i_143_ <= i_142_)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[0][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_144_ = 0; i_144_ < i_137_; i_144_++) {
	    for (int i_145_ = 0; i_145_ < i_136_; i_145_++) {
		if (i_145_ >= i_144_)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[0][2] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_146_ = i_137_ - 1; i_146_ >= 0; i_146_--) {
	    for (int i_147_ = 0; i_147_ < i_136_; i_147_++) {
		if (i_147_ >= i_146_)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[0][3] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_148_ = i_137_ - 1; i_148_ >= 0; i_148_--) {
	    for (int i_149_ = 0; i_149_ < i_136_; i_149_++) {
		if (i_149_ <= i_148_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[1][0] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_150_ = 0; i_150_ < i_137_; i_150_++) {
	    for (int i_151_ = 0; i_151_ < i_136_; i_151_++) {
		if (i_139_ < 0 || i_139_ >= is_138_.length)
		    i_139_++;
		else {
		    if (i_151_ >= i_150_ << 1)
			is_138_[i_139_] = (byte) -1;
		    i_139_++;
		}
	    }
	}
	is[1][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_152_ = 0; i_152_ < i_137_; i_152_++) {
	    for (int i_153_ = i_136_ - 1; i_153_ >= 0; i_153_--) {
		if (i_153_ <= i_152_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[1][2] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_154_ = i_137_ - 1; i_154_ >= 0; i_154_--) {
	    for (int i_155_ = i_136_ - 1; i_155_ >= 0; i_155_--) {
		if (i_155_ >= i_154_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[1][3] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_156_ = i_137_ - 1; i_156_ >= 0; i_156_--) {
	    for (int i_157_ = i_136_ - 1; i_157_ >= 0; i_157_--) {
		if (i_157_ <= i_156_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[2][0] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_158_ = i_137_ - 1; i_158_ >= 0; i_158_--) {
	    for (int i_159_ = 0; i_159_ < i_136_; i_159_++) {
		if (i_159_ >= i_158_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[2][1] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_160_ = 0; i_160_ < i_137_; i_160_++) {
	    for (int i_161_ = 0; i_161_ < i_136_; i_161_++) {
		if (i_161_ <= i_160_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[2][2] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_162_ = 0; i_162_ < i_137_; i_162_++) {
	    for (int i_163_ = i_136_ - 1; i_163_ >= 0; i_163_--) {
		if (i_163_ >= i_162_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[2][3] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_164_ = i_137_ - 1; i_164_ >= 0; i_164_--) {
	    for (int i_165_ = 0; i_165_ < i_136_; i_165_++) {
		if (i_165_ >= i_164_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[3][0] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_166_ = 0; i_166_ < i_137_; i_166_++) {
	    for (int i_167_ = 0; i_167_ < i_136_; i_167_++) {
		if (i_167_ <= i_166_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[3][1] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_168_ = 0; i_168_ < i_137_; i_168_++) {
	    for (int i_169_ = i_136_ - 1; i_169_ >= 0; i_169_--) {
		if (i_169_ >= i_168_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[3][2] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_170_ = i_137_ - 1; i_170_ >= 0; i_170_--) {
	    for (int i_171_ = i_136_ - 1; i_171_ >= 0; i_171_--) {
		if (i_171_ <= i_170_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[3][3] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_172_ = i_137_ - 1; i_172_ >= 0; i_172_--) {
	    for (int i_173_ = i_136_ - 1; i_173_ >= 0; i_173_--) {
		if (i_173_ >= i_172_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[4][0] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_174_ = i_137_ - 1; i_174_ >= 0; i_174_--) {
	    for (int i_175_ = 0; i_175_ < i_136_; i_175_++) {
		if (i_175_ <= i_174_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[4][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_176_ = 0; i_176_ < i_137_; i_176_++) {
	    for (int i_177_ = 0; i_177_ < i_136_; i_177_++) {
		if (i_177_ >= i_176_ >> 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[4][2] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_178_ = 0; i_178_ < i_137_; i_178_++) {
	    for (int i_179_ = i_136_ - 1; i_179_ >= 0; i_179_--) {
		if (i_179_ <= i_178_ << 1)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[4][3] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_180_ = 0; i_180_ < i_137_; i_180_++) {
	    for (int i_181_ = 0; i_181_ < i_136_; i_181_++) {
		if (i_181_ <= i_136_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[5][0] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_182_ = 0; i_182_ < i_137_; i_182_++) {
	    for (int i_183_ = 0; i_183_ < i_136_; i_183_++) {
		if (i_182_ <= i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[5][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_184_ = 0; i_184_ < i_137_; i_184_++) {
	    for (int i_185_ = 0; i_185_ < i_136_; i_185_++) {
		if (i_185_ >= i_136_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[5][2] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_186_ = 0; i_186_ < i_137_; i_186_++) {
	    for (int i_187_ = 0; i_187_ < i_136_; i_187_++) {
		if (i_186_ >= i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[5][3] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_188_ = 0; i_188_ < i_137_; i_188_++) {
	    for (int i_189_ = 0; i_189_ < i_136_; i_189_++) {
		if (i_189_ <= i_188_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[6][0] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_190_ = i_137_ - 1; i_190_ >= 0; i_190_--) {
	    for (int i_191_ = 0; i_191_ < i_136_; i_191_++) {
		if (i_191_ <= i_190_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[6][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_192_ = i_137_ - 1; i_192_ >= 0; i_192_--) {
	    for (int i_193_ = i_136_ - 1; i_193_ >= 0; i_193_--) {
		if (i_193_ <= i_192_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[6][2] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_194_ = 0; i_194_ < i_137_; i_194_++) {
	    for (int i_195_ = i_136_ - 1; i_195_ >= 0; i_195_--) {
		if (i_195_ <= i_194_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[6][3] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_196_ = 0; i_196_ < i_137_; i_196_++) {
	    for (int i_197_ = 0; i_197_ < i_136_; i_197_++) {
		if (i_197_ >= i_196_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[7][0] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_198_ = i_137_ - 1; i_198_ >= 0; i_198_--) {
	    for (int i_199_ = 0; i_199_ < i_136_; i_199_++) {
		if (i_199_ >= i_198_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[7][1] = is_138_;
	is_138_ = new byte[i_136_ * i_137_];
	i_139_ = 0;
	for (int i_200_ = i_137_ - 1; i_200_ >= 0; i_200_--) {
	    for (int i_201_ = i_136_ - 1; i_201_ >= 0; i_201_--) {
		if (i_201_ >= i_200_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[7][2] = is_138_;
	is_138_ = new byte[i_137_ * i_136_];
	i_139_ = 0;
	for (int i_202_ = 0; i_202_ < i_137_; i_202_++) {
	    for (int i_203_ = i_136_ - 1; i_203_ >= 0; i_203_--) {
		if (i_203_ >= i_202_ - i_137_ / 2)
		    is_138_[i_139_] = (byte) -1;
		i_139_++;
	    }
	}
	is[7][3] = is_138_;
	return is;
    }
    
    public static Class289 method8883(int i, int i_204_) {
	if (1668502049 * Class289.aClass289_3204.anInt3207 == i)
	    return Class289.aClass289_3204;
	if (i == Class289.aClass289_3202.anInt3207 * 1668502049)
	    return Class289.aClass289_3202;
	if (Class289.aClass289_3203.anInt3207 * 1668502049 == i)
	    return Class289.aClass289_3203;
	if (1668502049 * Class289.aClass289_3205.anInt3207 == i)
	    return Class289.aClass289_3205;
	if (Class289.aClass289_3206.anInt3207 * 1668502049 == i)
	    return Class289.aClass289_3206;
	return null;
    }
    
    static final void method8884(Class683 class683, int i) {
	int i_205_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688
		  .method14167(i_205_, (byte) 17);
    }
    
    public static File method8885(int i) {
	return Class662.aFile8475;
    }
    
    public static int method8886(String string, int i) {
	return string.length() + 2;
    }
}
