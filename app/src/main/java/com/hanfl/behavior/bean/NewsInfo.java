package com.hanfl.behavior.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 *
 */
public class NewsInfo implements Parcelable {

    private String postid;
    private boolean hasCover;
    private int hasHead;
    private int replyCount;
    private int hasImg;
    private String digest;
    private boolean hasIcon;
    private String docid;
    private String title;
    private int order;
    private int priority;
    private String lmodify;
    private String boardid;
    private String photosetID;
    private String template;
    private int votecount;
    private String skipID;
    private String alias;
    private String skipType;
    private String cid;
    private int hasAD;
    private String source;
    private String ename;
    private String imgsrc;
    private String tname;
    private String ptime;
    private String specialID;
    /**
     * title : 南京村庄建“楼叠楼” 为多拿拆迁补偿
     * tag : photoset
     * imgsrc : http://cms-bucket.nosdn.127.net/4693747579184988ad6e903e3e07793620160822095553.jpeg
     * subtitle :
     * url : 00AP0001|2192041
     */

    private List<AdData> ads;
    /**
     * imgsrc : http://cms-bucket.nosdn.127.net/381ed60794ff4b0785b9888453f514a420160822163245.jpeg
     */

    private List<ImgExtraData> imgextra;


    @Override
    public String toString() {
        return "NewsBean{" +
                "postid='" + postid + '\'' +
                ", hasCover=" + hasCover +
                ", hasHead=" + hasHead +
                ", replyCount=" + replyCount +
                ", hasImg=" + hasImg +
                ", digest='" + digest + '\'' +
                ", hasIcon=" + hasIcon +
                ", docid='" + docid + '\'' +
                ", title='" + title + '\'' +
                ", order=" + order +
                ", priority=" + priority +
                ", lmodify='" + lmodify + '\'' +
                ", boardid='" + boardid + '\'' +
                ", photosetID='" + photosetID + '\'' +
                ", template='" + template + '\'' +
                ", votecount=" + votecount +
                ", skipID='" + skipID + '\'' +
                ", alias='" + alias + '\'' +
                ", skipType='" + skipType + '\'' +
                ", cid='" + cid + '\'' +
                ", hasAD=" + hasAD +
                ", source='" + source + '\'' +
                ", ename='" + ename + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", tname='" + tname + '\'' +
                ", ptime='" + ptime + '\'' +
                ", specialID='" + specialID + '\'' +
                ", ads=" + ads +
                ", imgextra=" + imgextra +
                '}';
    }


    protected NewsInfo(Parcel in) {
        postid = in.readString();
        hasCover = in.readByte() != 0;
        hasHead = in.readInt();
        replyCount = in.readInt();
        hasImg = in.readInt();
        digest = in.readString();
        hasIcon = in.readByte() != 0;
        docid = in.readString();
        title = in.readString();
        order = in.readInt();
        priority = in.readInt();
        lmodify = in.readString();
        boardid = in.readString();
        photosetID = in.readString();
        template = in.readString();
        votecount = in.readInt();
        skipID = in.readString();
        alias = in.readString();
        skipType = in.readString();
        cid = in.readString();
        hasAD = in.readInt();
        source = in.readString();
        ename = in.readString();
        imgsrc = in.readString();
        tname = in.readString();
        ptime = in.readString();
        specialID = in.readString();

        //in.readList(ads, AdData.class.getClassLoader());
        in.readTypedList(ads, AdData.CREATOR);
        in.readTypedList(imgextra,ImgExtraData.CREATOR);
    }

    public static final Creator<NewsInfo> CREATOR = new Creator<NewsInfo>() {
        @Override
        public NewsInfo createFromParcel(Parcel in) {
            return new NewsInfo(in);
        }

        @Override
        public NewsInfo[] newArray(int size) {
            return new NewsInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(postid);
        parcel.writeByte((byte) (hasCover ? 1 : 0));
        parcel.writeInt(hasHead);
        parcel.writeInt(replyCount);
        parcel.writeInt(hasImg);
        parcel.writeString(digest);
        parcel.writeByte((byte) (hasIcon ? 1 : 0));
        parcel.writeString(docid);
        parcel.writeString(title);
        parcel.writeInt(order);
        parcel.writeInt(priority);
        parcel.writeString(lmodify);
        parcel.writeString(boardid);
        parcel.writeString(photosetID);
        parcel.writeString(template);
        parcel.writeInt(votecount);
        parcel.writeString(skipID);
        parcel.writeString(alias);
        parcel.writeString(skipType);
        parcel.writeString(cid);
        parcel.writeInt(hasAD);
        parcel.writeString(source);
        parcel.writeString(ename);
        parcel.writeString(imgsrc);
        parcel.writeString(tname);
        parcel.writeString(ptime);
        parcel.writeString(specialID);
        parcel.writeTypedList(ads);
        parcel.writeTypedList(imgextra);
    }
}
