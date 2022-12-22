package cn.yuanandwen.pojo;

public class Video {
    // id 主键
    private Integer vid;
    // 标题
    private String title;
    // 导演
    private String artist;
    // 描述信息
    private String description;

    private String image;
    private String video;

    public String getVideo() {

        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + vid +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
