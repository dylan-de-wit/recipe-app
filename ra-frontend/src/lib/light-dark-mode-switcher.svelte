<script lang="ts">

    // todo: implement nicely
    function switchMode(): void {
        const currentTheme = document.body.getAttribute('data-theme');
        const selectedTheme = currentTheme === 'dark' ? 'light' : 'dark';
        document.body.setAttribute('data-theme', selectedTheme);
    }
</script>

<button type="button" on:click={switchMode}>
    Switch mode
</button>