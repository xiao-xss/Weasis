//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgcodecs;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfDouble;
import org.opencv.core.MatOfInt;
import org.opencv.utils.Converters;

// C++: class Imgcodecs
//javadoc: Imgcodecs

public class Imgcodecs {

    public static final int
            CV_LOAD_IMAGE_UNCHANGED = -1,
            CV_LOAD_IMAGE_GRAYSCALE = 0,
            CV_LOAD_IMAGE_COLOR = 1,
            CV_LOAD_IMAGE_ANYDEPTH = 2,
            CV_LOAD_IMAGE_ANYCOLOR = 4,
            CV_LOAD_IMAGE_IGNORE_ORIENTATION = 128,
            CV_IMWRITE_JPEG_QUALITY = 1,
            CV_IMWRITE_JPEG_PROGRESSIVE = 2,
            CV_IMWRITE_JPEG_OPTIMIZE = 3,
            CV_IMWRITE_JPEG_RST_INTERVAL = 4,
            CV_IMWRITE_JPEG_LUMA_QUALITY = 5,
            CV_IMWRITE_JPEG_CHROMA_QUALITY = 6,
            CV_IMWRITE_PNG_COMPRESSION = 16,
            CV_IMWRITE_PNG_STRATEGY = 17,
            CV_IMWRITE_PNG_BILEVEL = 18,
            CV_IMWRITE_PNG_STRATEGY_DEFAULT = 0,
            CV_IMWRITE_PNG_STRATEGY_FILTERED = 1,
            CV_IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2,
            CV_IMWRITE_PNG_STRATEGY_RLE = 3,
            CV_IMWRITE_PNG_STRATEGY_FIXED = 4,
            CV_IMWRITE_PXM_BINARY = 32,
            CV_IMWRITE_EXR_TYPE = 48,
            CV_IMWRITE_WEBP_QUALITY = 64,
            CV_IMWRITE_PAM_TUPLETYPE = 128,
            CV_IMWRITE_PAM_FORMAT_NULL = 0,
            CV_IMWRITE_PAM_FORMAT_BLACKANDWHITE = 1,
            CV_IMWRITE_PAM_FORMAT_GRAYSCALE = 2,
            CV_IMWRITE_PAM_FORMAT_GRAYSCALE_ALPHA = 3,
            CV_IMWRITE_PAM_FORMAT_RGB = 4,
            CV_IMWRITE_PAM_FORMAT_RGB_ALPHA = 5,
            CV_CVTIMG_FLIP = 1,
            CV_CVTIMG_SWAP_RB = 2,
            IMREAD_UNCHANGED = -1,
            IMREAD_GRAYSCALE = 0,
            IMREAD_COLOR = 1,
            IMREAD_ANYDEPTH = 2,
            IMREAD_ANYCOLOR = 4,
            IMREAD_LOAD_GDAL = 8,
            IMREAD_REDUCED_GRAYSCALE_2 = 16,
            IMREAD_REDUCED_COLOR_2 = 17,
            IMREAD_REDUCED_GRAYSCALE_4 = 32,
            IMREAD_REDUCED_COLOR_4 = 33,
            IMREAD_REDUCED_GRAYSCALE_8 = 64,
            IMREAD_REDUCED_COLOR_8 = 65,
            IMREAD_IGNORE_ORIENTATION = 128,
            IMWRITE_JPEG_QUALITY = 1,
            IMWRITE_JPEG_PROGRESSIVE = 2,
            IMWRITE_JPEG_OPTIMIZE = 3,
            IMWRITE_JPEG_RST_INTERVAL = 4,
            IMWRITE_JPEG_LUMA_QUALITY = 5,
            IMWRITE_JPEG_CHROMA_QUALITY = 6,
            IMWRITE_PNG_COMPRESSION = 16,
            IMWRITE_PNG_STRATEGY = 17,
            IMWRITE_PNG_BILEVEL = 18,
            IMWRITE_PXM_BINARY = 32,
            IMWRITE_EXR_TYPE = (3 << 4) + 0,
            IMWRITE_WEBP_QUALITY = 64,
            IMWRITE_PAM_TUPLETYPE = 128,
            IMWRITE_EXR_TYPE_HALF = 1,
            IMWRITE_EXR_TYPE_FLOAT = 2,
            IMWRITE_PNG_STRATEGY_DEFAULT = 0,
            IMWRITE_PNG_STRATEGY_FILTERED = 1,
            IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2,
            IMWRITE_PNG_STRATEGY_RLE = 3,
            IMWRITE_PNG_STRATEGY_FIXED = 4,
            IMWRITE_PAM_FORMAT_NULL = 0,
            IMWRITE_PAM_FORMAT_BLACKANDWHITE = 1,
            IMWRITE_PAM_FORMAT_GRAYSCALE = 2,
            IMWRITE_PAM_FORMAT_GRAYSCALE_ALPHA = 3,
            IMWRITE_PAM_FORMAT_RGB = 4,
            IMWRITE_PAM_FORMAT_RGB_ALPHA = 5,
            ILV_NONE = 0,
            ILV_LINE = 1,
            ILV_SAMPLE = 2,
            DICOM_IMREAD_DEFAULT = -1,
            DICOM_IMREAD_UNSIGNED = 0,
            DICOM_IMREAD_SIGNED = 1,
            DICOM_IMREAD_YBR = 2,
            DICOM_IMREAD_BIGENDIAN = 4,
            DICOM_IMREAD_FLOAT = 16,
            DICOM_IMREAD_RLE = 32,
            DICOM_PARAM_IMREAD = 0,
            DICOM_PARAM_DCM_IMREAD = 1,
            DICOM_PARAM_WIDTH = 2,
            DICOM_PARAM_HEIGHT = 3,
            DICOM_PARAM_COMPRESSION = 4,
            DICOM_PARAM_COMPONENTS = 5,
            DICOM_PARAM_BITS_PER_SAMPLE = 6,
            DICOM_PARAM_INTERLEAVE_MODE = 7,
            DICOM_PARAM_BYTES_PER_LINE = 8,
            DICOM_PARAM_ALLOWED_LOSSY_ERROR = 9,
            DICOM_CP_UNKNOWN = 0,
            DICOM_CP_JPG = 1,
            DICOM_CP_JPLS = 2,
            DICOM_CP_J2K = 3;


    //
    // C++:  Mat dicomJpgRead(Mat buf, int dicomflags = 0, int flags = IMREAD_COLOR)
    //

    //javadoc: dicomJpgRead(buf, dicomflags, flags)
    public static Mat dicomJpgRead(Mat buf, int dicomflags, int flags)
    {
        
        Mat retVal = new Mat(dicomJpgRead_0(buf.nativeObj, dicomflags, flags));
        
        return retVal;
    }

    //javadoc: dicomJpgRead(buf)
    public static Mat dicomJpgRead(Mat buf)
    {
        
        Mat retVal = new Mat(dicomJpgRead_1(buf.nativeObj));
        
        return retVal;
    }


    //
    // C++:  Mat dicomJpgRead(String filename, vector_double segposition, vector_double seglength, int dicomflags = 0, int flags = IMREAD_COLOR)
    //

    //javadoc: dicomJpgRead(filename, segposition, seglength, dicomflags, flags)
    public static Mat dicomJpgRead(String filename, MatOfDouble segposition, MatOfDouble seglength, int dicomflags, int flags)
    {
        Mat segposition_mat = segposition;
        Mat seglength_mat = seglength;
        Mat retVal = new Mat(dicomJpgRead_2(filename, segposition_mat.nativeObj, seglength_mat.nativeObj, dicomflags, flags));
        
        return retVal;
    }

    //javadoc: dicomJpgRead(filename, segposition, seglength)
    public static Mat dicomJpgRead(String filename, MatOfDouble segposition, MatOfDouble seglength)
    {
        Mat segposition_mat = segposition;
        Mat seglength_mat = seglength;
        Mat retVal = new Mat(dicomJpgRead_3(filename, segposition_mat.nativeObj, seglength_mat.nativeObj));
        
        return retVal;
    }


    //
    // C++:  Mat dicomJpgWrite(Mat image, vector_int dicomParams, String colormodel)
    //

    //javadoc: dicomJpgWrite(image, dicomParams, colormodel)
    public static Mat dicomJpgWrite(Mat image, MatOfInt dicomParams, String colormodel)
    {
        Mat dicomParams_mat = dicomParams;
        Mat retVal = new Mat(dicomJpgWrite_0(image.nativeObj, dicomParams_mat.nativeObj, colormodel));
        
        return retVal;
    }


    //
    // C++:  Mat dicomRawRead(Mat buf, vector_int dicomParams, String colormodel)
    //

    //javadoc: dicomRawRead(buf, dicomParams, colormodel)
    public static Mat dicomRawRead(Mat buf, MatOfInt dicomParams, String colormodel)
    {
        Mat dicomParams_mat = dicomParams;
        Mat retVal = new Mat(dicomRawRead_0(buf.nativeObj, dicomParams_mat.nativeObj, colormodel));
        
        return retVal;
    }


    //
    // C++:  Mat dicomRawRead(String filename, vector_double segposition, vector_double seglength, vector_int dicomparams, String colormodel)
    //

    //javadoc: dicomRawRead(filename, segposition, seglength, dicomparams, colormodel)
    public static Mat dicomRawRead(String filename, MatOfDouble segposition, MatOfDouble seglength, MatOfInt dicomparams, String colormodel)
    {
        Mat segposition_mat = segposition;
        Mat seglength_mat = seglength;
        Mat dicomparams_mat = dicomparams;
        Mat retVal = new Mat(dicomRawRead_1(filename, segposition_mat.nativeObj, seglength_mat.nativeObj, dicomparams_mat.nativeObj, colormodel));
        
        return retVal;
    }


    //
    // C++:  Mat imdecode(Mat buf, int flags)
    //

    //javadoc: imdecode(buf, flags)
    public static Mat imdecode(Mat buf, int flags)
    {
        
        Mat retVal = new Mat(imdecode_0(buf.nativeObj, flags));
        
        return retVal;
    }


    //
    // C++:  Mat imread(String filename, int flags = IMREAD_COLOR)
    //

    //javadoc: imread(filename, flags)
    public static Mat imread(String filename, int flags)
    {
        
        Mat retVal = new Mat(imread_0(filename, flags));
        
        return retVal;
    }

    //javadoc: imread(filename)
    public static Mat imread(String filename)
    {
        
        Mat retVal = new Mat(imread_1(filename));
        
        return retVal;
    }


    //
    // C++:  bool imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    //

    //javadoc: imencode(ext, img, buf, params)
    public static boolean imencode(String ext, Mat img, MatOfByte buf, MatOfInt params)
    {
        Mat buf_mat = buf;
        Mat params_mat = params;
        boolean retVal = imencode_0(ext, img.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);
        
        return retVal;
    }

    //javadoc: imencode(ext, img, buf)
    public static boolean imencode(String ext, Mat img, MatOfByte buf)
    {
        Mat buf_mat = buf;
        boolean retVal = imencode_1(ext, img.nativeObj, buf_mat.nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool imreadmulti(String filename, vector_Mat& mats, int flags = IMREAD_ANYCOLOR)
    //

    //javadoc: imreadmulti(filename, mats, flags)
    public static boolean imreadmulti(String filename, List<Mat> mats, int flags)
    {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_0(filename, mats_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }

    //javadoc: imreadmulti(filename, mats)
    public static boolean imreadmulti(String filename, List<Mat> mats)
    {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_1(filename, mats_mat.nativeObj);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }


    //
    // C++:  bool imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    //

    //javadoc: imwrite(filename, img, params)
    public static boolean imwrite(String filename, Mat img, MatOfInt params)
    {
        Mat params_mat = params;
        boolean retVal = imwrite_0(filename, img.nativeObj, params_mat.nativeObj);
        
        return retVal;
    }

    //javadoc: imwrite(filename, img)
    public static boolean imwrite(String filename, Mat img)
    {
        
        boolean retVal = imwrite_1(filename, img.nativeObj);
        
        return retVal;
    }




    // C++:  Mat dicomJpgRead(Mat buf, int dicomflags = 0, int flags = IMREAD_COLOR)
    private static native long dicomJpgRead_0(long buf_nativeObj, int dicomflags, int flags);
    private static native long dicomJpgRead_1(long buf_nativeObj);

    // C++:  Mat dicomJpgRead(String filename, vector_double segposition, vector_double seglength, int dicomflags = 0, int flags = IMREAD_COLOR)
    private static native long dicomJpgRead_2(String filename, long segposition_mat_nativeObj, long seglength_mat_nativeObj, int dicomflags, int flags);
    private static native long dicomJpgRead_3(String filename, long segposition_mat_nativeObj, long seglength_mat_nativeObj);

    // C++:  Mat dicomJpgWrite(Mat image, vector_int dicomParams, String colormodel)
    private static native long dicomJpgWrite_0(long image_nativeObj, long dicomParams_mat_nativeObj, String colormodel);

    // C++:  Mat dicomRawRead(Mat buf, vector_int dicomParams, String colormodel)
    private static native long dicomRawRead_0(long buf_nativeObj, long dicomParams_mat_nativeObj, String colormodel);

    // C++:  Mat dicomRawRead(String filename, vector_double segposition, vector_double seglength, vector_int dicomparams, String colormodel)
    private static native long dicomRawRead_1(String filename, long segposition_mat_nativeObj, long seglength_mat_nativeObj, long dicomparams_mat_nativeObj, String colormodel);

    // C++:  Mat imdecode(Mat buf, int flags)
    private static native long imdecode_0(long buf_nativeObj, int flags);

    // C++:  Mat imread(String filename, int flags = IMREAD_COLOR)
    private static native long imread_0(String filename, int flags);
    private static native long imread_1(String filename);

    // C++:  bool imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencode_0(String ext, long img_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencode_1(String ext, long img_nativeObj, long buf_mat_nativeObj);

    // C++:  bool imreadmulti(String filename, vector_Mat& mats, int flags = IMREAD_ANYCOLOR)
    private static native boolean imreadmulti_0(String filename, long mats_mat_nativeObj, int flags);
    private static native boolean imreadmulti_1(String filename, long mats_mat_nativeObj);

    // C++:  bool imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    private static native boolean imwrite_0(String filename, long img_nativeObj, long params_mat_nativeObj);
    private static native boolean imwrite_1(String filename, long img_nativeObj);

}