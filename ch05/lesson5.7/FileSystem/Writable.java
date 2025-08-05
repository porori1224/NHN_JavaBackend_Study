package FileSystem;
// 쓰기 가능
public interface Writable {
    void write(byte[] data);
    void writeString(String content);
    void append(byte[] data);
}
