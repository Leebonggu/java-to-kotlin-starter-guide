package section_3

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

/**
 * package section_3;
 *
 * import kotlin.Metadata;
 * import kotlin.jvm.internal.Intrinsics;
 * import kotlin.text.StringsKt;
 * import org.jetbrains.annotations.NotNull;
 *
 * @Metadata(
 *    mv = {1, 5, 1},
 *    k = 2,
 *    d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"},
 *    d2 = {"isDirectoryPath", "", "path", "", "kotlin-with-java"}
 * )
 * public final class StringUtilsKt {
 *    public static final boolean isDirectoryPath(@NotNull String path) {
 *       Intrinsics.checkNotNullParameter(path, "path");
 *       return StringsKt.endsWith$default(path, "/", false, 2, (Object)null);
 *    }
 * }
 *
 */