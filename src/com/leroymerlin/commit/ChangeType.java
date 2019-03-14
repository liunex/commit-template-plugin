package com.leroymerlin.commit;

/**
 * From https://github.com/commitizen/conventional-commit-types
 *
 * @author Damien Arrachequesne
 */
public enum ChangeType {

    FEAT("新功能", "A new feature"),
    FIX("Bug修复", "A bug fix"),
    DOCS("文档改动", "Documentation only changes"),
    STYLE("格式化", "Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)"),
    REFACTOR("代码重构", "A code change that neither fixes a bug nor adds a feature"),
    PERF("性能优化", "A code change that improves performance"),
    TEST("代码测试", "Adding missing tests or correcting existing tests"),
    BUILD("项目构建", "Changes that affect the build system or external dependencies (example scopes: gulp, broccoli, npm)"),
    CI("持续集成", "Changes to our CI configuration files and scripts (example scopes: Travis, Circle, BrowserStack, SauceLabs)"),
    CHORE("其他", "Other changes that don't modify src or test files"),
    REVERT("撤销", "Reverts a previous commit");

    public final String title;
    public final String description;

    ChangeType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String label() {
        return "[" + this.title + "]";
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.label(), this.description);
    }
}
